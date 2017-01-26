package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_45 {
    private final Production76_45 production = new Production76_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}