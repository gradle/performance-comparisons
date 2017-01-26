package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_489 {
    private final Production76_489 production = new Production76_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}