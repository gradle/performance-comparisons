package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_251 {
    private final Production76_251 production = new Production76_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}