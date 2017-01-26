package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_268 {
    private final Production76_268 production = new Production76_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}