package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_23 {
    private final Production76_23 production = new Production76_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}