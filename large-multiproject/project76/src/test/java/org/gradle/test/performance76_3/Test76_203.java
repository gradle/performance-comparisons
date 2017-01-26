package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_203 {
    private final Production76_203 production = new Production76_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}