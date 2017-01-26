package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_272 {
    private final Production76_272 production = new Production76_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}