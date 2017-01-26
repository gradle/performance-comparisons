package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_57 {
    private final Production76_57 production = new Production76_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}