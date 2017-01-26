package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_14 {
    private final Production76_14 production = new Production76_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}