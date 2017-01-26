package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_267 {
    private final Production76_267 production = new Production76_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}