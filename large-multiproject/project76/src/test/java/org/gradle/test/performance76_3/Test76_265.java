package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_265 {
    private final Production76_265 production = new Production76_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}