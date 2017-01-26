package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_426 {
    private final Production48_426 production = new Production48_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}