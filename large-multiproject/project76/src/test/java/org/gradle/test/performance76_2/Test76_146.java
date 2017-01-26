package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_146 {
    private final Production76_146 production = new Production76_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}