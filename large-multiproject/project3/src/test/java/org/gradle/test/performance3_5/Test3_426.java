package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_426 {
    private final Production3_426 production = new Production3_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}