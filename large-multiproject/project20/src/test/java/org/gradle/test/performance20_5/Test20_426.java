package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_426 {
    private final Production20_426 production = new Production20_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}