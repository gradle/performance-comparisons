package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_330 {
    private final Production76_330 production = new Production76_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}