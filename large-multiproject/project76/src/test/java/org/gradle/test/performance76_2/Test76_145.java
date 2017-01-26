package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_145 {
    private final Production76_145 production = new Production76_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}