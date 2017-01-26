package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_18 {
    private final Production47_18 production = new Production47_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}