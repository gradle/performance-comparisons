package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_379 {
    private final Production76_379 production = new Production76_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}