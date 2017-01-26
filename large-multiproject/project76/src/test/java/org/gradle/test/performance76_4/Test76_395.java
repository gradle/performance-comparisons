package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_395 {
    private final Production76_395 production = new Production76_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}