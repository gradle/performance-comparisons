package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_449 {
    private final Production30_449 production = new Production30_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}