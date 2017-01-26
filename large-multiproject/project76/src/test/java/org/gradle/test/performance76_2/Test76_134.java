package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_134 {
    private final Production76_134 production = new Production76_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}