package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_278 {
    private final Production76_278 production = new Production76_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}