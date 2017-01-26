package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_360 {
    private final Production84_360 production = new Production84_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}