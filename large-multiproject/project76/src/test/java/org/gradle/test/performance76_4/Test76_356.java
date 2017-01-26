package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_356 {
    private final Production76_356 production = new Production76_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}