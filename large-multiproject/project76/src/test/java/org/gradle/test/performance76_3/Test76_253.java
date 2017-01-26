package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_253 {
    private final Production76_253 production = new Production76_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}