package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_55 {
    private final Production76_55 production = new Production76_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}