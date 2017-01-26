package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_260 {
    private final Production76_260 production = new Production76_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}