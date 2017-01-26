package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_150 {
    private final Production76_150 production = new Production76_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}