package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_161 {
    private final Production76_161 production = new Production76_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}