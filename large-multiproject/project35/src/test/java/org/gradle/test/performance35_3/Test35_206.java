package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_206 {
    private final Production35_206 production = new Production35_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}