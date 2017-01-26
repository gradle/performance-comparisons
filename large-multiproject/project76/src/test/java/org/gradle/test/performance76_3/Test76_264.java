package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_264 {
    private final Production76_264 production = new Production76_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}