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
public class SportsmanStrategyJumpLong implements SportsmanStrategyJump {

    @Override
    public String jump() {
        return "LongJumping";
    }

    @Override
    public String toString() {
        return "Long";
    }
    
    
}
