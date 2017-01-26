package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_286 {
    private final Production76_286 production = new Production76_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}