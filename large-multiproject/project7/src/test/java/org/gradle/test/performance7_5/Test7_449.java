package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_449 {
    private final Production7_449 production = new Production7_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}