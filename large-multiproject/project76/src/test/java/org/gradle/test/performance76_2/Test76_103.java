package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_103 {
    private final Production76_103 production = new Production76_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}