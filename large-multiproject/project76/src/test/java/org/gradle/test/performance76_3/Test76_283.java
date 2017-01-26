package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_283 {
    private final Production76_283 production = new Production76_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}