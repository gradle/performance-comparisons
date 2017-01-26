package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_426 {
    private final Production98_426 production = new Production98_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}