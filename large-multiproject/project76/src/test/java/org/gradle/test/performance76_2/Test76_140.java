package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_140 {
    private final Production76_140 production = new Production76_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}