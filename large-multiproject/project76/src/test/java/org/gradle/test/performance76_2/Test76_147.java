package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_147 {
    private final Production76_147 production = new Production76_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}