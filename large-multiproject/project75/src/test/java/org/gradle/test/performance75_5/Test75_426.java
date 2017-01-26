package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_426 {
    private final Production75_426 production = new Production75_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}