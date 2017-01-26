package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_158 {
    private final Production76_158 production = new Production76_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}