package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_450 {
    private final Production76_450 production = new Production76_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}