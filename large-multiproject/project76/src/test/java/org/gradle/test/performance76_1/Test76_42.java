package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_42 {
    private final Production76_42 production = new Production76_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}