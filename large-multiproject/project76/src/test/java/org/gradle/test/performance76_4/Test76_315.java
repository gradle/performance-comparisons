package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_315 {
    private final Production76_315 production = new Production76_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}