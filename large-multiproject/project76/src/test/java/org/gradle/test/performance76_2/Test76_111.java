package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_111 {
    private final Production76_111 production = new Production76_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}