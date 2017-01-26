package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_313 {
    private final Production76_313 production = new Production76_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}