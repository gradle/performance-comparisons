package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_70 {
    private final Production47_70 production = new Production47_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}