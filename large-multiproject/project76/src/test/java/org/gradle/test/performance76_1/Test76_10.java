package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_10 {
    private final Production76_10 production = new Production76_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}