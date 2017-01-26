package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_83 {
    private final Production76_83 production = new Production76_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}