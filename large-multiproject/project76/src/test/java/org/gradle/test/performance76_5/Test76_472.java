package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_472 {
    private final Production76_472 production = new Production76_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}