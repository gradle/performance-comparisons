package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_426 {
    private final Production31_426 production = new Production31_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}