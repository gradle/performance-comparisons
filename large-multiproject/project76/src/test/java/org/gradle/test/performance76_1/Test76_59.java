package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_59 {
    private final Production76_59 production = new Production76_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}