package org.ghailene;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.ArrayList;
import java.util.List;

public class InteviewDeveloppers implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        List<Integer> requestedSalary = new ArrayList<>();
        requestedSalary.add(54000); // the salary request by the first developper
        requestedSalary.add(55000); // the salary request by the second developper
        requestedSalary.add(60000); // the salary request by the third developper
        requestedSalary.add(47000); // the salary request by the forth developper
        requestedSalary.add(50000); // the salary request by the fifth developper

        delegateExecution.setVariable("numbersOfCandidatures",requestedSalary.size()); // equal to the number of instance to create in usertask
        delegateExecution.setVariable("salaryByDevelopper",requestedSalary);
    }
}
