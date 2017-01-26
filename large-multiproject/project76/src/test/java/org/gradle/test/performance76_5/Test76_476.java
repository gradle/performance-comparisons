package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_476 {
    private final Production76_476 production = new Production76_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}