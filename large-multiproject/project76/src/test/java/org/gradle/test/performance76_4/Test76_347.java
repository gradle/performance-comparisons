package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_347 {
    private final Production76_347 production = new Production76_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}