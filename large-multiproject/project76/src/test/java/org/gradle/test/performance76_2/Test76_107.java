package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_107 {
    private final Production76_107 production = new Production76_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}