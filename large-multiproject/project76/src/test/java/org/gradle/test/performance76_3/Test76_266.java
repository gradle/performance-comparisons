package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_266 {
    private final Production76_266 production = new Production76_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}