package calc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GetList {

	String ne = new String("誰だ");
	;
	Map<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetList kore = new GetList();
		kore.map.put("kaminari",30);
		kore.map.put("taiatari", 20);
	    System.out.println(kore.map);
	    System.out.println(kore.map.get("taiatari"));
	    
	    //(0,1)乱数で処理を変える
	    if (new Random().nextInt(2) == 0) {
	    	System.out.println(0 + "いけるやん");
	    }else {
	    	System.out.println(1 + "いけるやん");
	    }
	}

	Map getWaza() {
		
		return this.map;
	}
}
