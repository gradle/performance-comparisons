package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_61 {
    private final Production76_61 production = new Production76_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}