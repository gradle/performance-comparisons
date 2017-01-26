package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_475 {
    private final Production76_475 production = new Production76_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}