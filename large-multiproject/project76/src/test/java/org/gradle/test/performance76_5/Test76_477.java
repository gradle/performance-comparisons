package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_477 {
    private final Production76_477 production = new Production76_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}