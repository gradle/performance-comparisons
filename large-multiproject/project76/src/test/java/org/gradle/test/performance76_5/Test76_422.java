package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_422 {
    private final Production76_422 production = new Production76_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}