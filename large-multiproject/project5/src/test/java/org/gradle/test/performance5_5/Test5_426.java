package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_426 {
    private final Production5_426 production = new Production5_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}