package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_419 {
    private final Production76_419 production = new Production76_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}