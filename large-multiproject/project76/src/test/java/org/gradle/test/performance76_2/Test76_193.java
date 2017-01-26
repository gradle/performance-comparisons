package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_193 {
    private final Production76_193 production = new Production76_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}