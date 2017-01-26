package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_441 {
    private final Production76_441 production = new Production76_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}