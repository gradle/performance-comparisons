package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_228 {
    private final Production76_228 production = new Production76_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}