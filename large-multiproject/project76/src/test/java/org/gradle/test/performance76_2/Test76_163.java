package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_163 {
    private final Production76_163 production = new Production76_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}