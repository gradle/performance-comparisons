package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_303 {
    private final Production76_303 production = new Production76_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}