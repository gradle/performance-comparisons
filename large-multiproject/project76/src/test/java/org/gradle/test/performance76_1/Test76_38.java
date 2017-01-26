package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_38 {
    private final Production76_38 production = new Production76_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}