package pr7;

import java.util.*;
import java.lang.*;

class Creat_Double_List{

    public static String play(LinkedList cards_1, LinkedList cards_2){

        for (int i=0; i<106; i++){
            if (cards_1.size() == 0){
                System.out.println("The number of steps is: " + i);
                return "second " +i;
            } else if (cards_2.size() == 0){
                System.out.println("The number of steps is: " + i);
                return "first " +i ;
            } else {
                Integer card_1 = (int) cards_1.getFirst();
                Integer card_2 = (int) cards_2.getFirst();
                if (card_1 != 0 && card_2!=0){
                    if (card_1 > card_2){
                        cards_1.addLast(card_1);
                        cards_1.addLast(card_2);
                        cards_1.remove(0);
                        cards_2.remove(0);
                    } else if (card_1 < card_2){
                        cards_2.addLast(card_2);
                        cards_2.addLast(card_1);
                        cards_2.remove(0);
                        cards_1.remove(0);
                    }
                } else if(card_1 == 9 || card_2==9){
                    if (card_1 == 0){
                        cards_1.addLast(card_1);
                        cards_1.addLast(card_2);
                        cards_1.remove(0);
                        cards_2.remove(0);
                    } else if (card_2 == 0){
                        cards_2.addLast(card_2);
                        cards_2.addLast(card_1);
                        cards_2.remove(0);
                        cards_1.remove(0);
                    }
                }
            }
        }
        return "bolda";
    }
}