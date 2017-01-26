package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_360 {
    private final Production13_360 production = new Production13_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}