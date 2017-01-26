package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_100 {
    private final Production76_100 production = new Production76_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}