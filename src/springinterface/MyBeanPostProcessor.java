/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springinterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author Administrator
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object beanContext, String beanName) throws BeansException {
        System.out.println(beanName+"Bean Post Processor befor Init");
        return  beanContext;
    }

    @Override
    public Object postProcessAfterInitialization(Object beanContext, String beanName) throws BeansException {
        System.out.println(beanName+"Bean Post Processor befor Init");
        return  beanContext;  
    }
 
    
}
