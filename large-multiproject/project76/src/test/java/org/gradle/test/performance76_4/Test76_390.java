package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_390 {
    private final Production76_390 production = new Production76_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}