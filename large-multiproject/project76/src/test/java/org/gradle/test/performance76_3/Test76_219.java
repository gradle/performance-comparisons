package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_219 {
    private final Production76_219 production = new Production76_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}