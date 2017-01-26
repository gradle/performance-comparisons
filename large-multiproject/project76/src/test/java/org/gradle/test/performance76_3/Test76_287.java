package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_287 {
    private final Production76_287 production = new Production76_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}