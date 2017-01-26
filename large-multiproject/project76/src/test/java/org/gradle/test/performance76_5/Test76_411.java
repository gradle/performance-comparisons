package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_411 {
    private final Production76_411 production = new Production76_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}