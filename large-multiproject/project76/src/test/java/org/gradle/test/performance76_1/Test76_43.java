package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_43 {
    private final Production76_43 production = new Production76_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}