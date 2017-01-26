package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_382 {
    private final Production76_382 production = new Production76_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}