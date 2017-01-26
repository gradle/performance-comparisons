package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_81 {
    private final Production76_81 production = new Production76_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}