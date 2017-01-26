package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_426 {
    private final Production16_426 production = new Production16_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}