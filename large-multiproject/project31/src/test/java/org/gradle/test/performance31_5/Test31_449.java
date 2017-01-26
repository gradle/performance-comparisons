package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_449 {
    private final Production31_449 production = new Production31_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}