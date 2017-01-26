package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_244 {
    private final Production76_244 production = new Production76_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}