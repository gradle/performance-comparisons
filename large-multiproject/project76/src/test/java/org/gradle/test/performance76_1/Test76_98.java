package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_98 {
    private final Production76_98 production = new Production76_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}