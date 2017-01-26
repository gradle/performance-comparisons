package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_142 {
    private final Production76_142 production = new Production76_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}