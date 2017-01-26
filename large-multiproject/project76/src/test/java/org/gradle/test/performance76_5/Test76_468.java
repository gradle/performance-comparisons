package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_468 {
    private final Production76_468 production = new Production76_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}