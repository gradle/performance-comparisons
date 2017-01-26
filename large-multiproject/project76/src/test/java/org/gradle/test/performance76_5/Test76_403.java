package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_403 {
    private final Production76_403 production = new Production76_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}