package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_358 {
    private final Production76_358 production = new Production76_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}