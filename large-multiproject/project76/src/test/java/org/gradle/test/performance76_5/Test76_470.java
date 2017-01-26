package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_470 {
    private final Production76_470 production = new Production76_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}