package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_133 {
    private final Production76_133 production = new Production76_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}