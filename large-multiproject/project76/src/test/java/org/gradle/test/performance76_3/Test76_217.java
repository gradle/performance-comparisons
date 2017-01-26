package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_217 {
    private final Production76_217 production = new Production76_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}