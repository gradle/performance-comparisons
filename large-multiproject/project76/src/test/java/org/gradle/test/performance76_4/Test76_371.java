package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_371 {
    private final Production76_371 production = new Production76_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}