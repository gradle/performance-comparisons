package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_482 {
    private final Production76_482 production = new Production76_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}