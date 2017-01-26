package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_426 {
    private final Production18_426 production = new Production18_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}