package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_249 {
    private final Production76_249 production = new Production76_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}