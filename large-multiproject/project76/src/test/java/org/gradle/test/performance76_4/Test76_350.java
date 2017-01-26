package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_350 {
    private final Production76_350 production = new Production76_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}