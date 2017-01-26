package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_426 {
    private final Production84_426 production = new Production84_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}