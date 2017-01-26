package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_180 {
    private final Production76_180 production = new Production76_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}