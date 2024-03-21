package ru.mpei.lec7.protocols;

import javassist.tools.reflect.Reflection;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import ru.mpei.lec7.Bean;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Container {

    private static Map<String, DataExchanger> exchangers = new HashMap<>();


    public static DataExchanger get(String name){
        return exchangers.get(name);
    }

//    public void ini() {
    static {
        Reflections r = new Reflections(DataExchanger.class);
        Set<Class<?>> typesAnnotatedWith = r.getTypesAnnotatedWith(Bean.class);
        for (Class<?> type : typesAnnotatedWith) {
            if (!DataExchanger.class.isAssignableFrom(type)){
                continue;
            }
            DataExchanger inst = null;
            try {
                inst = (DataExchanger)type.getDeclaredConstructor().newInstance();
                if (inst instanceof Iec104DataExchanger){
                    Field field = Iec104DataExchanger.class.getDeclaredField("byteOrder");
                    field.setAccessible(true);
                    field.set(inst, 10);
                    field.setAccessible(false);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            Bean declaredAnnotation = type.getDeclaredAnnotation(Bean.class);

            exchangers.put(declaredAnnotation.name(), inst);
        }
    }
}
