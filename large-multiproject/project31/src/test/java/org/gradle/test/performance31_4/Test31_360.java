package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_360 {
    private final Production31_360 production = new Production31_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}