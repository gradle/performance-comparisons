package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_76 {
    private final Production76_76 production = new Production76_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}