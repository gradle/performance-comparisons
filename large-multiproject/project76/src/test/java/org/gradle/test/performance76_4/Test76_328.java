package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_328 {
    private final Production76_328 production = new Production76_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}