package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_339 {
    private final Production76_339 production = new Production76_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}