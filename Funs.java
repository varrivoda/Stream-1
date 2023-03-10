package example;
import java.util.List;

interface Action<T>{
	T act(T x, T y);
}

public class Funs {
    public static <T> T action(Action<T> action, List<T> args){
        T res=args.get(0);
		for(int i=1;i<args.size(); i++) res=action.act(res, args.get(i));
		return res;
    }
}