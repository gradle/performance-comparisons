package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_41 {
    private final Production76_41 production = new Production76_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}