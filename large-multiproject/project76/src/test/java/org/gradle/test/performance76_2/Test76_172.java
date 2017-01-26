package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_172 {
    private final Production76_172 production = new Production76_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}