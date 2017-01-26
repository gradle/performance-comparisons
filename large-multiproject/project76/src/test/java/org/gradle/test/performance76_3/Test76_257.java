package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_257 {
    private final Production76_257 production = new Production76_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}