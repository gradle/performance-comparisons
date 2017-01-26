package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_306 {
    private final Production76_306 production = new Production76_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}