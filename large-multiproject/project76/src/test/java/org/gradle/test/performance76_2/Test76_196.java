package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_196 {
    private final Production76_196 production = new Production76_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}