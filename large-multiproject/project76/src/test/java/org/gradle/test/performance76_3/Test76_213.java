package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_213 {
    private final Production76_213 production = new Production76_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}