package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_425 {
    private final Production76_425 production = new Production76_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}