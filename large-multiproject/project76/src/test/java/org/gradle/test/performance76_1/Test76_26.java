package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_26 {
    private final Production76_26 production = new Production76_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}