package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_342 {
    private final Production76_342 production = new Production76_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}