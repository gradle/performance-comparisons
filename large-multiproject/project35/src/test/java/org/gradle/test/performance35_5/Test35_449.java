package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_449 {
    private final Production35_449 production = new Production35_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}