package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_63 {
    private final Production76_63 production = new Production76_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}