package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_309 {
    private final Production76_309 production = new Production76_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}