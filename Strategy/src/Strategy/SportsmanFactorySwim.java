/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author WIT
 */
public abstract class SportsmanFactorySwim {
    private static final SportsmanStrategySwim[] list = new SportsmanStrategySwim[]{
        new SportsmanStrategySwimFrog(),
        new SportsmanStrategySwimButterfly(),
        new SportsmanStrategySwimCraul(),
    };
    
    public static List<String> keys(){
        return Arrays.asList(list).stream().map((s)->s.toString()).collect(Collectors.toList());
    }

    public static SportsmanStrategySwim get(String name){
        return Arrays.asList(list).stream().filter((s)->s.toString().equals(name)).findFirst().orElseThrow(null);
//        for(SportsmanStrategySwim item : list){
//            if(item.toString().equals(name)){
//                return item;
//            }
//        }
//        return null;
    }

}
