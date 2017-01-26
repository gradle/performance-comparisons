package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_360 {
    private final Production47_360 production = new Production47_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}