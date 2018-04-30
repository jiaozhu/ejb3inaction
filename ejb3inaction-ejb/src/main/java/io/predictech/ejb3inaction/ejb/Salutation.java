package io.predictech.ejb3inaction.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * @author Weijie Zhao
 * @email tttx(at)me.com
 * @date 2018/4/30
 * @description
 */
@Local
@Remote
public interface Salutation {
    public String getFormalSalutation(String name);

    public String getInformalSalution(String name);
}
