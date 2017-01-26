package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_92 {
    private final Production76_92 production = new Production76_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}