package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_345 {
    private final Production76_345 production = new Production76_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}