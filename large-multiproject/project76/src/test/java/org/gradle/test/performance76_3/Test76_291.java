package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_291 {
    private final Production76_291 production = new Production76_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}