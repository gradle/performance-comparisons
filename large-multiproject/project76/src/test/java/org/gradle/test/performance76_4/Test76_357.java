package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_357 {
    private final Production76_357 production = new Production76_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}