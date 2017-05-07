package in.ponshere.androiddatabinding.counter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import in.ponshere.androiddatabinding.R;
import in.ponshere.androiddatabinding.databinding.BindingCounter;

public class CounterActivity extends AppCompatActivity {

    BindingCounter binding;
    Counter counter;
    CounterThread counterThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        counter = new Counter(0);
        counterThread = new CounterThread(counter);
        counterThread.start();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_counter);
        binding.setCounter(counter);
        binding.setListener(this);
    }

    public void onStartClicked(View v){
        counterThread.startCounter();
        binding.btnStop.setEnabled(true);
        binding.btnStart.setEnabled(false);

    }

    public void onStopClicked(View v){
        counterThread.stopCounter();
        binding.btnStart.setEnabled(true);
        binding.btnStop.setEnabled(false);

    }

    public void onResetClicked(View v){
        counterThread.resetCounter();
        binding.btnStart.setEnabled(true);
        binding.btnStop.setEnabled(false);
    }

    static class CounterThread extends Thread{
        private boolean isRunning = false;
        private boolean doStopThread = false;
        Counter counter;

        public void startCounter(){
            isRunning = true;
        }
        public void stopCounter(){
            isRunning = false;
        }
        public void resetCounter(){
            isRunning = false;
            counter.setValue(counter.initialValue);
        }

        public CounterThread(Counter counter){
            this.counter = counter;
        }
        @Override
        public void run() {
            while (!doStopThread){
                if(isRunning){
                    counter.setValue(counter.getValue()+1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void stopThread(){
            doStopThread = true;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        counterThread.stopThread();
    }
}
