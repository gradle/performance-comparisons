package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_449 {
    private final Production53_449 production = new Production53_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}