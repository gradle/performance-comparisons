package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_126 {
    private final Production76_126 production = new Production76_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}