public class StateBasedControlIntro {
    public static void main(String[] args){

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }


        //int state = 0;
        //switch (state){
        //    case 0: // on
                // 1. whatever the state is supposed to do
                // 2. How to leave the state


                // light = 1; THIS IS 1.
                // if (button == true){ THIS IS 2.
                //  state = 1;
                // }
        //    case 1: // off
                // some code

                // light = 0; THIS IS 1.
                // if (button == true){ THIS IS 2.
                //  state = 0;
                // }
        //}
    }
}
