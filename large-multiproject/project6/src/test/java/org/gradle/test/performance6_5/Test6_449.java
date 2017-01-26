package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_449 {
    private final Production6_449 production = new Production6_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}