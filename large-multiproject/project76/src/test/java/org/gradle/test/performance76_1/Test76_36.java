package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_36 {
    private final Production76_36 production = new Production76_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}