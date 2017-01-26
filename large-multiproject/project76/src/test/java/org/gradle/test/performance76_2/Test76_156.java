package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_156 {
    private final Production76_156 production = new Production76_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}