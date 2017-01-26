package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_71 {
    private final Production76_71 production = new Production76_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}