package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_216 {
    private final Production76_216 production = new Production76_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}