/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import org.junit.Test;

public class SportsmanCommandTest {

     @Test
     public void testRun() {
         Sportsman sportsman = new Sportsman("John");
         assertEquals(sportsman.execute(new SportsmanCommandRun()), "John: Running");
     }

     @Test
     public void testJump() {
         Sportsman sportsman = new Sportsman("John");
         assertEquals(sportsman.execute(new SportsmanCommandJump()), "John: Jumping");
     }

     @Test
     public void testSwim() {
         Sportsman sportsman = new Sportsman("John");
         assertEquals(sportsman.execute(new SportsmanCommandSwim()), "John: Swimming");
     }

     @Test
     public void testTrening() {
         final Sportsman sportsman = new Sportsman("John");
         final ArrayList<SportsmanCommand> list = new ArrayList<SportsmanCommand>()
         {
             {
                 add(new SportsmanCommandRun());
                 add(new SportsmanCommandJump());
                 add(new SportsmanCommandSwim());
             }
         };
         assertEquals(sportsman.execute(new SportsmanCommandTrening("", list)), "John: Running, Jumping, Swimming");
     }

     @Test
     public void testLoop(){
         final Sportsman sportsman = new Sportsman("John");

         final SportsmanCommand command = new SportsmanCommandRun();

         assertEquals(sportsman.execute(new SportsmanCommandLoop("", 3, command)), "John: 3 x Running");
     }

     @Test
     public void testLoopTrainning(){
         final Sportsman sportsman = new Sportsman("John");
        final ArrayList<SportsmanCommand> list = new ArrayList<SportsmanCommand>()
         {
             {
                 add(new SportsmanCommandRun());
                 add(new SportsmanCommandJump());
                 add(new SportsmanCommandSwim());
             }
         };
         final SportsmanCommand command = new SportsmanCommandTrening("", list);

         assertEquals(sportsman.execute(new SportsmanCommandLoop("", 3, command)), "John: 3 x (Running, Jumping, Swimming)");
     }
}
