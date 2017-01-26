package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_387 {
    private final Production76_387 production = new Production76_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}