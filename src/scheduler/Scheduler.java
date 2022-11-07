package scheduler;

public interface Scheduler {
	
	//다음 고객의 콜을 가져오는 것
	void getNextCall();
	//상담원에게 콜을 던지는 것
	void sendCallToAgent();
}
