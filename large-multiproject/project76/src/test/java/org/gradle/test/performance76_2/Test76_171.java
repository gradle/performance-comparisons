package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_171 {
    private final Production76_171 production = new Production76_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}