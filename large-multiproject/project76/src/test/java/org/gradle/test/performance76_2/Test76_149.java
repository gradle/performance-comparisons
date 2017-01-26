package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_149 {
    private final Production76_149 production = new Production76_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}