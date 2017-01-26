package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_97 {
    private final Production76_97 production = new Production76_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}