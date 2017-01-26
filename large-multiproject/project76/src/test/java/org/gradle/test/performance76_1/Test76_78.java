package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_78 {
    private final Production76_78 production = new Production76_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}