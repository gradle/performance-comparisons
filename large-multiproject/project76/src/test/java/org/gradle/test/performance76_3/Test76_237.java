package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_237 {
    private final Production76_237 production = new Production76_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}