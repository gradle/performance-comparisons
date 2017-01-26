package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_152 {
    private final Production76_152 production = new Production76_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}