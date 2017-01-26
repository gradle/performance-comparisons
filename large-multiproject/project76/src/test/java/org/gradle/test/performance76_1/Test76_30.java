package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_30 {
    private final Production76_30 production = new Production76_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}