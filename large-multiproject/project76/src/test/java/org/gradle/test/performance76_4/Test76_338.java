package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_338 {
    private final Production76_338 production = new Production76_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}