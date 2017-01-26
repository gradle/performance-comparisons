package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_121 {
    private final Production76_121 production = new Production76_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}