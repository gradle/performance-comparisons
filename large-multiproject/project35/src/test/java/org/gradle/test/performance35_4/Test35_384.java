package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_384 {
    private final Production35_384 production = new Production35_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}