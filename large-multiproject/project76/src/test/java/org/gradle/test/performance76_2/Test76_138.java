package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_138 {
    private final Production76_138 production = new Production76_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}