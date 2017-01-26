package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_106 {
    private final Production76_106 production = new Production76_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}