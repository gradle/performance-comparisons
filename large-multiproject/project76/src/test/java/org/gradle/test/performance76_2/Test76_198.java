package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_198 {
    private final Production76_198 production = new Production76_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}