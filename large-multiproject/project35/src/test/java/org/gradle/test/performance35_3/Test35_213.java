package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_213 {
    private final Production35_213 production = new Production35_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}