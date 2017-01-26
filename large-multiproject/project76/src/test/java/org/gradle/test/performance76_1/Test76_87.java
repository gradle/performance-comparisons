package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_87 {
    private final Production76_87 production = new Production76_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}