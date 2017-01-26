package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_12 {
    private final Production76_12 production = new Production76_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}