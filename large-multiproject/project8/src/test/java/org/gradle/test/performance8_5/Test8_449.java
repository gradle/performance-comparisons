package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_449 {
    private final Production8_449 production = new Production8_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}