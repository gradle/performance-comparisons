package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_423 {
    private final Production76_423 production = new Production76_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}