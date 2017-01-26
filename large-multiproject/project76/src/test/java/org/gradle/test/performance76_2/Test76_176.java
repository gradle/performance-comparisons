package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_176 {
    private final Production76_176 production = new Production76_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}