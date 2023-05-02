
import java.util.*;

public class hw5 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("пять", "Five");
        map.put("два", "Two");
        map.put("один", "One");

        String str = map.get("пять");
        System.out.println(str);

        map.remove("пять");
        map.remove("пять", "Five");

        map.put("пять", "Five");

//        for (String key: map.keySet()) {
//            System.out.println(map.get(key));
//        }
//
//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(map.get(key));
//        }
//
//        Set keys = map.keySet();
//        for (int i=0; i< keys.size();i++){
//            System.out.println(map.get(keys.toArray()[i]));
//        }

        map.replace("пять", "5");
        map.replace("пять", "Five", "5");

        map.getOrDefault("шесть", "0");
        map.containsKey("шесть");
        map.containsValue("5");
        map.putIfAbsent("шесть", "6");
        map.forEach((k, v) -> System.out.println(k+" "+v));

        map.compute("шесть", (k, v) -> v+="!");

        map.computeIfPresent("шесть", (k, v) -> v+"!?");
        map.computeIfAbsent("шесть", v -> v+"!?!");

        for (String key: map.keySet()) {
//            map.compute(key, (k, v) -> v+"!");
            map.merge(key, "!", String::concat);
        }

        System.out.println(map);

        map.merge("один", "7", String::concat);

        System.out.println(map);

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("пять", "Five");
        hashMap.put("два", "Two");
        hashMap.put("один", "One");
        hashMap.putIfAbsent("шесть", "6");
        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        treeMap.putIfAbsent(6, "6");
        System.out.println(treeMap.headMap(2, true));
        System.out.println(treeMap.tailMap(2, false));

        int[] ints;
        ArrayList<Integer> integers;
        HashMap<Integer, Integer> map1;

    }
}