package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_201 {
    private final Production76_201 production = new Production76_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}