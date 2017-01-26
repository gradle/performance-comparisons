package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_285 {
    private final Production76_285 production = new Production76_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}