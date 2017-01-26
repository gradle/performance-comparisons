package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_52 {
    private final Production76_52 production = new Production76_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}