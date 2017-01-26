package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_281 {
    private final Production76_281 production = new Production76_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}