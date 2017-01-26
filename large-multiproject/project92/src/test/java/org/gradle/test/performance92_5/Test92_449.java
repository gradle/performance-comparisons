package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_449 {
    private final Production92_449 production = new Production92_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}