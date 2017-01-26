package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_29 {
    private final Production76_29 production = new Production76_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}