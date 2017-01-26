package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_331 {
    private final Production76_331 production = new Production76_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}