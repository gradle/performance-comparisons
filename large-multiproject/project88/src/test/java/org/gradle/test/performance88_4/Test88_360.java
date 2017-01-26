package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_360 {
    private final Production88_360 production = new Production88_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}