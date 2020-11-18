/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Ice
 */
public class SportsmanStrategyRunSprint implements SportsmanStrategyRun {

    @Override
    public String run() {
        return "Sprinting";
    }

    @Override
    public String toString() {
        return "Sprint";
    }
    
    
}
