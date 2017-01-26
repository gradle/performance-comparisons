package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_188 {
    private final Production76_188 production = new Production76_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}