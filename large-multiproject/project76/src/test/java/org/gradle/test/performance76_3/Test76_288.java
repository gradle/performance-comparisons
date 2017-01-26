package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_288 {
    private final Production76_288 production = new Production76_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}