package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_364 {
    private final Production76_364 production = new Production76_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}