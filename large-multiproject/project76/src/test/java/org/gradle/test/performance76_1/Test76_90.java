package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_90 {
    private final Production76_90 production = new Production76_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}