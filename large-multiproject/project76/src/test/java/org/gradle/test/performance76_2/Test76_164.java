package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_164 {
    private final Production76_164 production = new Production76_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}