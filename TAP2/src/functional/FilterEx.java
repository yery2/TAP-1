package functional;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEx{

    public static <T> List <T> filterEx(List<T> llista,Predicate<T> p){
        List <T> resultat = new LinkedList<>();
        for(T elem : llista){
            if(p.test(elem)){
                resultat.add(elem);
            }
        }
        return resultat;
    }

     public static void main(String[] args) {
         List<Integer> elems = new LinkedList<>();
         elems.add(1);
         elems.add(2);
         elems.add(3);
         elems.add(4);

         Predicate<Integer> odd = x -> (x%2) != 0;

         List<Integer> results = filterEx(elems,odd);

         System.out.println(results);

     }
}