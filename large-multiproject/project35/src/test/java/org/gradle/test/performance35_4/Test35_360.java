package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_360 {
    private final Production35_360 production = new Production35_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}