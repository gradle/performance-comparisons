package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_127 {
    private final Production76_127 production = new Production76_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}