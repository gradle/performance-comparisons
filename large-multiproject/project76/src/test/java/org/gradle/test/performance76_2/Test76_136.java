package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_136 {
    private final Production76_136 production = new Production76_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}