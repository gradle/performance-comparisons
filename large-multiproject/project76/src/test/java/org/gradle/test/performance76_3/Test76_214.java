package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_214 {
    private final Production76_214 production = new Production76_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}