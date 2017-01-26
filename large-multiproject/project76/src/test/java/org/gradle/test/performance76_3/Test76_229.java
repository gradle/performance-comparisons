package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_229 {
    private final Production76_229 production = new Production76_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}