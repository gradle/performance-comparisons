package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_360 {
    private final Production76_360 production = new Production76_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}