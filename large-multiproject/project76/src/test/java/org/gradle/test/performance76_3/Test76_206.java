package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_206 {
    private final Production76_206 production = new Production76_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}