package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_294 {
    private final Production76_294 production = new Production76_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}