package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_35 {
    private final Production76_35 production = new Production76_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}