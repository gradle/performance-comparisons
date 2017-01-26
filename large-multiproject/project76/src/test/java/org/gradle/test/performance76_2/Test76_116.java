package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_116 {
    private final Production76_116 production = new Production76_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}