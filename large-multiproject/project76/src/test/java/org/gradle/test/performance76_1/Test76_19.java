package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_19 {
    private final Production76_19 production = new Production76_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}