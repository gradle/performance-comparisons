package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_183 {
    private final Production76_183 production = new Production76_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}