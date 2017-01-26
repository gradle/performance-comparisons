package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_498 {
    private final Production76_498 production = new Production76_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}