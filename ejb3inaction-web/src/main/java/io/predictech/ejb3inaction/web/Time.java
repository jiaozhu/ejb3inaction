package io.predictech.ejb3inaction.web;

import io.predictech.ejb3inaction.ejb.TimeOfDay;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Weijie Zhao
 * @email tttx(at)me.com
 * @date 2018/5/1
 * @description
 */
@WebService
public class Time {

    @EJB(name = "TimeOfDayBean", mappedName = "TimeOfDayBean")
    private TimeOfDay timeOfDay;

    @WebMethod(operationName = "timeOfDay")
    public String timeOfDay() {
        return timeOfDay.timeOfDay();
    }
}
