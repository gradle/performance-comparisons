package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_137 {
    private final Production76_137 production = new Production76_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}