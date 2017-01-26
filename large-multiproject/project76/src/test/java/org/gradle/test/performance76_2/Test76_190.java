package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_190 {
    private final Production76_190 production = new Production76_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}