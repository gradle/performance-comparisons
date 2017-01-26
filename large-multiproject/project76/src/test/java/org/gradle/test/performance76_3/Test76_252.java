package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_252 {
    private final Production76_252 production = new Production76_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}