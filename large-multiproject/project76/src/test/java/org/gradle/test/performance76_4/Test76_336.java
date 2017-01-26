package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_336 {
    private final Production76_336 production = new Production76_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}