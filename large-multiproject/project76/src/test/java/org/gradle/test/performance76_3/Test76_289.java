package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_289 {
    private final Production76_289 production = new Production76_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}