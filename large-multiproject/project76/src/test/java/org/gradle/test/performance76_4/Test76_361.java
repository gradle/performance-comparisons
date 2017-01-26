package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_361 {
    private final Production76_361 production = new Production76_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}