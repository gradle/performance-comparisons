package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_293 {
    private final Production76_293 production = new Production76_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}