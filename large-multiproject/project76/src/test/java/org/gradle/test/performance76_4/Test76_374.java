package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_374 {
    private final Production76_374 production = new Production76_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}