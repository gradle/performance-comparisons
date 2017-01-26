package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_51 {
    private final Production76_51 production = new Production76_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}