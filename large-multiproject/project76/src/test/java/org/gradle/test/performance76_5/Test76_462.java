package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_462 {
    private final Production76_462 production = new Production76_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}