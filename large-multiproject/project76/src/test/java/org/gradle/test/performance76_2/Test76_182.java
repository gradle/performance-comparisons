package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_182 {
    private final Production76_182 production = new Production76_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}