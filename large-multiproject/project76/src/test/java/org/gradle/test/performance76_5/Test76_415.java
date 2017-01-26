package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_415 {
    private final Production76_415 production = new Production76_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}