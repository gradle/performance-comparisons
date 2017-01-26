package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_317 {
    private final Production35_317 production = new Production35_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}