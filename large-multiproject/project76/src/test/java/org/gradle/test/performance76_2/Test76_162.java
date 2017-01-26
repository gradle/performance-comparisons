package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_162 {
    private final Production76_162 production = new Production76_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}