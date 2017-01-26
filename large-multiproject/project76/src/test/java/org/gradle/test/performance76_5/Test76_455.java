package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_455 {
    private final Production76_455 production = new Production76_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}