package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_15 {
    private final Production76_15 production = new Production76_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}