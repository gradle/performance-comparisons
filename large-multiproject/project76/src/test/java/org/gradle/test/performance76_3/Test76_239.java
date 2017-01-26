package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_239 {
    private final Production76_239 production = new Production76_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}