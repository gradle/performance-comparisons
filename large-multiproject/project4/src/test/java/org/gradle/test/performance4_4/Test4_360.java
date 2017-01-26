package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_360 {
    private final Production4_360 production = new Production4_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}