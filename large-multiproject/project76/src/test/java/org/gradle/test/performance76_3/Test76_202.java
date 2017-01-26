package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_202 {
    private final Production76_202 production = new Production76_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}