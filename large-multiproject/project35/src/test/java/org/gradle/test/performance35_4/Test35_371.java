package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_371 {
    private final Production35_371 production = new Production35_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}