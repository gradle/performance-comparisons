package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_174 {
    private final Production76_174 production = new Production76_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}