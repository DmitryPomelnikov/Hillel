package Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Lesson5 {
    public static void main(String[] args) {
//        List<String> makeArray = new ArrayList<>();
//        List<String> makeArray7 = new ArrayList<>();
//        List<String> makeArray8 = new ArrayList<>();
//        List<String> makeArray9 = new ArrayList<>();
//        List<String> makeArray10 = new ArrayList<>();
//        makeArray.add("202 - MORGANTOWN MAVIS,\n" +
//                "1060 CROSSING BLVD.,, ELVERSON, PA 19520");
//        makeArray.add("MONRO/BG #158,\n" +
//                "3997 PERKIOMEN AVE, READING, PA 19606");
//        makeArray.add("MR. TIRE #754,\n" +
//                "425 MANCHESTER RD, WESTMINSTER, MD 21157");
//        for (int i = 0; i < makeArray.size(); i++) {
//            int indexComa = makeArray.get(i).indexOf(",");
//            System.out.println(indexComa);
//            makeArray7.add(makeArray.get(i).substring(0, indexComa+1));
//            System.out.println(makeArray7.get(i));
//            makeArray10.add(makeArray.get(i).substring(indexComa+1));
//            System.out.println(makeArray10.get(i));
//            int indexComa2 = makeArray10.get(i).indexOf(",");
//            makeArray8.add(makeArray10.get(i).substring(0,indexComa2 + 1));
//            System.out.println(makeArray8.get(i));
//            makeArray9.add(makeArray10.get(i).substring(indexComa2 + 1));
//            System.out.println(makeArray9.get(i));
//        }

        String nbd= "202 - MORGANTOWN MAVIS,\n1060 CROSSING BLVD.,, ELVERSON, PA 19520";
        System.out.println(nbd.indexOf(",\n"));

    }
}
