package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_304 {
    private final Production76_304 production = new Production76_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}