package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_469 {
    private final Production76_469 production = new Production76_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}