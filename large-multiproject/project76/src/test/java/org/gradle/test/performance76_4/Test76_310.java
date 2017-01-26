package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_310 {
    private final Production76_310 production = new Production76_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}