package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_400 {
    private final Production76_400 production = new Production76_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}