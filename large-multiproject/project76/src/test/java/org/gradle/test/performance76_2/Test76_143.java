package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_143 {
    private final Production76_143 production = new Production76_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}