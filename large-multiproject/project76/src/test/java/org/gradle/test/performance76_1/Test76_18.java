package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_18 {
    private final Production76_18 production = new Production76_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}