package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_231 {
    private final Production76_231 production = new Production76_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}