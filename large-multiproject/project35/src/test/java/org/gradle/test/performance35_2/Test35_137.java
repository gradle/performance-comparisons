package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_137 {
    private final Production35_137 production = new Production35_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}