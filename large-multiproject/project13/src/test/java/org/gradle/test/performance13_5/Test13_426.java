package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_426 {
    private final Production13_426 production = new Production13_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}