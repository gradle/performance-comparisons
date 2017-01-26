package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_373 {
    private final Production76_373 production = new Production76_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}