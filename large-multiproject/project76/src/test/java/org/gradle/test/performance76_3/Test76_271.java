package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_271 {
    private final Production76_271 production = new Production76_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}