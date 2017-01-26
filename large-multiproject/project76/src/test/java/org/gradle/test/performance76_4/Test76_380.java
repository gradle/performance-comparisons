package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_380 {
    private final Production76_380 production = new Production76_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}