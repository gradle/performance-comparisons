package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_220 {
    private final Production76_220 production = new Production76_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}