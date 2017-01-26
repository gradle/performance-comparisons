package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_431 {
    private final Production76_431 production = new Production76_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}