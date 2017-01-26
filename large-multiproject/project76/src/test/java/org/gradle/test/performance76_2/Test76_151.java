package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_151 {
    private final Production76_151 production = new Production76_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}