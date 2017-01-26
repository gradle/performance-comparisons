package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_497 {
    private final Production76_497 production = new Production76_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}