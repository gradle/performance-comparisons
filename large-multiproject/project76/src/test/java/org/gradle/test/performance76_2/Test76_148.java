package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_148 {
    private final Production76_148 production = new Production76_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}