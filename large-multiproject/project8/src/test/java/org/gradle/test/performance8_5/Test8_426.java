package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_426 {
    private final Production8_426 production = new Production8_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}