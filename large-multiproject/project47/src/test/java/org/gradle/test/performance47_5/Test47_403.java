package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_403 {
    private final Production47_403 production = new Production47_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}