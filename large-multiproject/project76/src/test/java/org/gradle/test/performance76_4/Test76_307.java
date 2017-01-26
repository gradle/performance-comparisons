package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_307 {
    private final Production76_307 production = new Production76_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}