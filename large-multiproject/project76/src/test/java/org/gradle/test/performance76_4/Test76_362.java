package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_362 {
    private final Production76_362 production = new Production76_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}