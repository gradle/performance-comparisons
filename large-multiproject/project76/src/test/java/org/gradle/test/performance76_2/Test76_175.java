package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_175 {
    private final Production76_175 production = new Production76_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}