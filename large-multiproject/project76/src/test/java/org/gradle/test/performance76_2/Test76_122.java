package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_122 {
    private final Production76_122 production = new Production76_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}