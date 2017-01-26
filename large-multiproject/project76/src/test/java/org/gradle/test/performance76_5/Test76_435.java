package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_435 {
    private final Production76_435 production = new Production76_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}