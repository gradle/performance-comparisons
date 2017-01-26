package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_426 {
    private final Production61_426 production = new Production61_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}