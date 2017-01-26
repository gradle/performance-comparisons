package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_215 {
    private final Production76_215 production = new Production76_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}