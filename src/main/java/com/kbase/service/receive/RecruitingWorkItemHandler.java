package com.kbase.service.receive;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class RecruitingWorkItemHandler
implements WorkItemHandler {
    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        workItemManager.abortWorkItem(workItem.getId());
    }

    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        System.out.println("Candidate selected for interview is Prabakar  ::: ");
        HashMap<String, Object> results = new HashMap<String, Object>();
        results.put("Result", "Prabakar");
        workItemManager.completeWorkItem(workItem.getId(), results);
    }
}