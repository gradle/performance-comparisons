package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_109 {
    private final Production76_109 production = new Production76_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}