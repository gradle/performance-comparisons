package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_112 {
    private final Production76_112 production = new Production76_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}