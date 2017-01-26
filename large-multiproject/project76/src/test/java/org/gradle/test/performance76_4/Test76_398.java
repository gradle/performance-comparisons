package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_398 {
    private final Production76_398 production = new Production76_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}