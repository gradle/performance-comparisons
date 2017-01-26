package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_114 {
    private final Production76_114 production = new Production76_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}