package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_135 {
    private final Production76_135 production = new Production76_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}