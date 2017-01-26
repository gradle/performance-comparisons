package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_325 {
    private final Production76_325 production = new Production76_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}