package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_297 {
    private final Production76_297 production = new Production76_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}