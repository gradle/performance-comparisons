package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_139 {
    private final Production76_139 production = new Production76_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}