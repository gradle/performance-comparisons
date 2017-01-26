package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_34 {
    private final Production76_34 production = new Production76_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}