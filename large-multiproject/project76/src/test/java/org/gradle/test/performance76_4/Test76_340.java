package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_340 {
    private final Production76_340 production = new Production76_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}