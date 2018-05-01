package io.predictech.ejb3inaction.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * @author Weijie Zhao
 * @email tttx(at)me.com
 * @date 2018/5/1
 * @description
 */
@Remote
@Local
public interface TimeOfDay {

    public String timeOfDay();
}
