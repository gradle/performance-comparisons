package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_181 {
    private final Production76_181 production = new Production76_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}