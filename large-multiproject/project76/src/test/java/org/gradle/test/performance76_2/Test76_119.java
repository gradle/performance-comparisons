package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_119 {
    private final Production76_119 production = new Production76_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}