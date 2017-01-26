package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_473 {
    private final Production76_473 production = new Production76_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}