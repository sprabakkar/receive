package com.kbase.service.receive;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.kbase.service.util.BagBuilder;

public class BagExistCheckWorkItemHandler implements WorkItemHandler {

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		// TODO Auto-generated method stub
		
	}

	public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
		// TODO Auto-generated method stub
		String projectId = (String)workItem.getParameter("projectId");
		String bagId = (String)workItem.getParameter("bagId");
		String version = (String)workItem.getParameter("version");
		System.out.println("ProjectId is ::: "+projectId);
		System.out.println("BagId is ::: "+bagId);
		
		//Boolean result = BagBuilder.checkBagExists(projectId, bagId);
		String result = BagBuilder.checkBagExistsString(projectId,bagId,version);
		System.out.println("From BagExistCheckWorkItemHandler Result is :::: "+result);

        Map<String, Object> results = new HashMap<String, Object>();
        results.put("Result", result);
        workItemManager.completeWorkItem(workItem.getId(), results);
		
	}

}
