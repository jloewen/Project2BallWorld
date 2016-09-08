public class BallRunner
{
      public static void run (){
       BallWorld ballWorld = new BallWorld (200, 200);
       TGPoint tgPoint = new TGPoint (0,0);
       BallBot ballBot = new BallBot (ballWorld, tgPoint, 90.0, 30);
       while (true){
		if (ballBot.canMoveForward(ballWorld))ballBot.moveForward();
		else ballBot.setHeading ((ballBot.getHeading() + 90.0)%360);
			}
   }
}

