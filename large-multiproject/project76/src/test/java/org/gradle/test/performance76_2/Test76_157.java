package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_157 {
    private final Production76_157 production = new Production76_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}