package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_324 {
    private final Production76_324 production = new Production76_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}