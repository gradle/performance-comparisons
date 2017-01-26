package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_434 {
    private final Production76_434 production = new Production76_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}