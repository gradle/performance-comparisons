package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_235 {
    private final Production76_235 production = new Production76_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}