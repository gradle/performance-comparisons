package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_209 {
    private final Production76_209 production = new Production76_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}