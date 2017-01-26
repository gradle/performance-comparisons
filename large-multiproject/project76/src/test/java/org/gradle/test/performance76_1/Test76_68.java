package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_68 {
    private final Production76_68 production = new Production76_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}