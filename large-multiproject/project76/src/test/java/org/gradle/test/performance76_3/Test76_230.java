package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_230 {
    private final Production76_230 production = new Production76_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}