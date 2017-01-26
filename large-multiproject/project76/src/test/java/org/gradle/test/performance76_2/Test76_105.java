package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_105 {
    private final Production76_105 production = new Production76_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}