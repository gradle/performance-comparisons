package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_131 {
    private final Production76_131 production = new Production76_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}