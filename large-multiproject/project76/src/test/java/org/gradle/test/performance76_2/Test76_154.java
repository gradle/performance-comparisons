package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_154 {
    private final Production76_154 production = new Production76_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}