package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_31 {
    private final Production76_31 production = new Production76_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}