package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_302 {
    private final Production76_302 production = new Production76_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}