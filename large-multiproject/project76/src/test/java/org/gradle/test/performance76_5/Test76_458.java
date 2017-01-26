package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_458 {
    private final Production76_458 production = new Production76_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}