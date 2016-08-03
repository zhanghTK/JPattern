package tk.zhangh.pattern.behavior.chain;

import org.apache.log4j.Logger;

/**
 * 责任链中二级审核人
 * Created by ZhangHao on 2016/7/8.
 */
public class Manager extends Leader{
    private Logger logger = Logger.getLogger(Manager.class);

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            logger.info(String.format("员工：%s请假%s天，请假原因：%s。经理：%s审批通过",
                    request.getEmpName(), request.getLeaveDays(), request.getLeaveReason(), name));
        }else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}