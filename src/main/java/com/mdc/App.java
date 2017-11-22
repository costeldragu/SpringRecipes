package com.mdc;

import com.mdc.sequence.SequenceGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author : Costel DRAGU
 * @version $Id:$
 * @package : com.mdc
 * @copyright Copyright (c) 2017
 * @date : 22.11.2017 20:26
 */
public class App {

    private static final String CONTEXT_XML = "classpath:/META-INF/beans.xml";

    public static void main(String[] args) {
            ApplicationContext context =
                    new GenericXmlApplicationContext(CONTEXT_XML);

            SequenceGenerator generator =
                    (SequenceGenerator) context.getBean("sequenceGenerator");

            System.out.println(generator.getSequence());
            System.out.println(generator.getSequence());
        }
}
