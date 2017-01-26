package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_91 {
    private final Production76_91 production = new Production76_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}