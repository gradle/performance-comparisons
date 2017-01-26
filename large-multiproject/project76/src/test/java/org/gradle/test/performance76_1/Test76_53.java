package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_53 {
    private final Production76_53 production = new Production76_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}