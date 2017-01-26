package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_243 {
    private final Production76_243 production = new Production76_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}