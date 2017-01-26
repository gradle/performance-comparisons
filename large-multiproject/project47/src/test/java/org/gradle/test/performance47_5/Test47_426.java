package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_426 {
    private final Production47_426 production = new Production47_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}