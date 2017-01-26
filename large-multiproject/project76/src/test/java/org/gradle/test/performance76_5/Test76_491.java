package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_491 {
    private final Production76_491 production = new Production76_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}