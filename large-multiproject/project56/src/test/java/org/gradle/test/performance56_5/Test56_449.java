package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_449 {
    private final Production56_449 production = new Production56_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}