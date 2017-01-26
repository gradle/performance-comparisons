package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_1 {
    private final Production76_1 production = new Production76_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}