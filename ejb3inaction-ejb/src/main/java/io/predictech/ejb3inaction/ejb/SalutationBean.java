package io.predictech.ejb3inaction.ejb;

import javax.ejb.Stateless;

/**
 * @author Weijie Zhao
 * @email tttx(at)me.com
 * @date 2018/4/30
 * @description
 */
@Stateless(name = "SalutationBean", mappedName = "SalutationBean")
public class SalutationBean implements Salutation {
    public String getFormalSalutation(String name) {
        return "Dear " + name;
    }

    public String getInformalSalution(String name) {
        return "Hi " + name;
    }
}
