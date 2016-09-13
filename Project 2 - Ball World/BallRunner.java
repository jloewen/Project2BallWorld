
/**
 *BallRunner 
 *Jameson Loewen 
 *September 6, 2016
//  */
public class BallRunner
{
    BallWorld ballWorld = new BallWorld(500, 500);
    TGPoint entrancePoint = new TGPoint(0,0);
    BallBot ballBotArray[] = new BallBot[12];
    private double heading;
    public BallRunner()
    {
        BallWorld ballWorld = new BallWorld(500,500);
        TGPoint entrancePoint = new TGPoint(0,0);
        int ballBotArrayLength = 12;

    }

    public static void activity1(){
        int x = 0;
        BallWorld ballWorld1 = new BallWorld(200, 200);
        TGPoint tgPoint1 = new TGPoint(0,0);
        BallBot ballBot1 = new BallBot(ballWorld1, tgPoint1, 0, 25);
        while(x==0){
            if(ballBot1.canMoveForward(ballWorld1) == true){
                ballBot1.moveForward();
            }
            else{
                ballBot1.setHeading((ballBot1.getHeading()%360)+90);
            }
        }
    }

    public int findFreeBallBotIndex(){
        int gat = 0;
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                gat = i;
            }
            else{
                gat = ballBotArray.length;

            }
        }
        return gat;
    }    

    public static void activity2(){

    } 
}
