package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_426 {
    private final Production41_426 production = new Production41_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}