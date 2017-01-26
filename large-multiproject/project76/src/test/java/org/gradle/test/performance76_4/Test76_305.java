package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_305 {
    private final Production76_305 production = new Production76_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}