package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_426 {
    private final Production80_426 production = new Production80_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}