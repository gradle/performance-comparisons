package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_25 {
    private final Production76_25 production = new Production76_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}