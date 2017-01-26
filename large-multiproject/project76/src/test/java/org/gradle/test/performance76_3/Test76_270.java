package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_270 {
    private final Production76_270 production = new Production76_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}