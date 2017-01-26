package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_166 {
    private final Production76_166 production = new Production76_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}