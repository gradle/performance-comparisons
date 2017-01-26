package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_48 {
    private final Production76_48 production = new Production76_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}