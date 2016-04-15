package testBase;

import java.util.HashMap;
import java.util.Map;

public class DS {
	
	
	public static void main(String[] args) {
		
		int w[] = {3,3,4,3,3,4};
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i=0;i<w.length;i++){
			boolean b = false;
			for(int f=0;f<w.length;f++){
				if(i != f){
					if(w[i]==w[f]){
						if(b==false){
							m.put(w[i],2);
							b = true;
						}else if(b==true){
							m.put(w[i],m.get(w[i]) + 1);
						}
					}
				}
			}
		}
		
		for(int g : m.keySet()){
			System.out.println(g +" times "+m.get(g));
		}
		
	}

}
