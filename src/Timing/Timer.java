package Timing;

public class Timer implements ITimer{

    long start,resumed,total,total_atm;
    boolean paused;
    @Override
    public void start() {
        start=System.currentTimeMillis();
        resumed=0;
        total=0;
        total_atm=0;
        paused=false;
    }

    @Override
    public long stop() {
        if(!paused)
        {
            total_atm=System.currentTimeMillis()-start;
            total+=total_atm;
        }
        return total;
    }

    @Override
    public void resume() {
        if(paused)
        {
            total+=pause();
            paused=false;
            start=System.currentTimeMillis();
        }
    }

    @Override
    public long pause() {
        if(!paused)
        {
            total_atm=System.currentTimeMillis()-start;
            paused=true;

        }
        return total_atm;
    }
}
