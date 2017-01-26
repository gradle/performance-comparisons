package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_204 {
    private final Production76_204 production = new Production76_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}