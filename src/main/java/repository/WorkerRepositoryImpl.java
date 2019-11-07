package repository;

import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("workerRepository")
public class WorkerRepositoryImpl implements WorkerRepository{

    public HashMap getWorkerDetails() {

       // HashMap workers = new HashMap();

        Map<String, List<Double>> workers= new HashMap<String,List<Double>>();

        List<Double> setOne = new ArrayList<Double>();
        setOne.add(7.50);
        setOne.add(35.0);

        List<Double> setTwo = new ArrayList<Double>();
        setTwo.add(8.20);
        setTwo.add(47.0);

        List<Double> setThree = new ArrayList<Double>();
        setThree.add(10.00);
        setThree.add(73.0);

        workers.put("Dileep",setOne);
        workers.put("Dinesh",setTwo);
        workers.put("Ravi",setThree);

        return (HashMap) workers;
    }


}
