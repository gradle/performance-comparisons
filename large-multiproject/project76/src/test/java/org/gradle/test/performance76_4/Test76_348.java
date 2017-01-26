package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_348 {
    private final Production76_348 production = new Production76_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}