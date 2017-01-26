package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_481 {
    private final Production76_481 production = new Production76_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}