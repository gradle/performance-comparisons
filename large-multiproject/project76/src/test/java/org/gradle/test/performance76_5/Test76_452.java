package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_452 {
    private final Production76_452 production = new Production76_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}