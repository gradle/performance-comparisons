package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_449 {
    private final Production50_449 production = new Production50_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}