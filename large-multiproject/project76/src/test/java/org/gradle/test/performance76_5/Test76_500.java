package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_500 {
    private final Production76_500 production = new Production76_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}