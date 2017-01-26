package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_363 {
    private final Production35_363 production = new Production35_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}