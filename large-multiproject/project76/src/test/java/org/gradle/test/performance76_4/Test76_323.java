package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_323 {
    private final Production76_323 production = new Production76_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}