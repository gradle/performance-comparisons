package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_187 {
    private final Production76_187 production = new Production76_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}