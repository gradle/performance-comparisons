package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_168 {
    private final Production76_168 production = new Production76_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}