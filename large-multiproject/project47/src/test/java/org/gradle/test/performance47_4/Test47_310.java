package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_310 {
    private final Production47_310 production = new Production47_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}