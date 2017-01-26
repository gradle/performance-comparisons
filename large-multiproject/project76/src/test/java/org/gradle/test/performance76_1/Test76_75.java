package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_75 {
    private final Production76_75 production = new Production76_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}