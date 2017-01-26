package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_432 {
    private final Production76_432 production = new Production76_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}