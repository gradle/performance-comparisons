package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_238 {
    private final Production76_238 production = new Production76_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}