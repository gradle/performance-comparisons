package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_165 {
    private final Production76_165 production = new Production76_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}