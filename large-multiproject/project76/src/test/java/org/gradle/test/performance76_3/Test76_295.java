package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_295 {
    private final Production76_295 production = new Production76_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}