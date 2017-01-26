package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_321 {
    private final Production76_321 production = new Production76_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}