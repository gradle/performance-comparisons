package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_173 {
    private final Production76_173 production = new Production76_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}