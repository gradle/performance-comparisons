package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_7 {
    private final Production76_7 production = new Production76_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}