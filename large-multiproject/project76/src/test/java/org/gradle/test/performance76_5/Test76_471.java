package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_471 {
    private final Production76_471 production = new Production76_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}