package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_488 {
    private final Production76_488 production = new Production76_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}