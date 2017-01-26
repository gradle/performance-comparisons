package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_404 {
    private final Production76_404 production = new Production76_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}