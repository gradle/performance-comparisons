package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_195 {
    private final Production76_195 production = new Production76_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}