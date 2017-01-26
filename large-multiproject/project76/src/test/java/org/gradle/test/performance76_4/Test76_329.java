package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_329 {
    private final Production76_329 production = new Production76_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}