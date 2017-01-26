package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_426 {
    private final Production76_426 production = new Production76_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}