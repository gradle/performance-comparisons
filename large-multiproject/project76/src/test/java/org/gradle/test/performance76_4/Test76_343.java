package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_343 {
    private final Production76_343 production = new Production76_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}