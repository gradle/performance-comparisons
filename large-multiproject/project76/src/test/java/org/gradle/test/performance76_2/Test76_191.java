package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_191 {
    private final Production76_191 production = new Production76_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}