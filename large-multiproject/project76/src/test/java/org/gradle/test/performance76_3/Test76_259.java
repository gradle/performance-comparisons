package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_259 {
    private final Production76_259 production = new Production76_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}