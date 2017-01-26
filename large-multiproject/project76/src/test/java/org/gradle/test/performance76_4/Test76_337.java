package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_337 {
    private final Production76_337 production = new Production76_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}