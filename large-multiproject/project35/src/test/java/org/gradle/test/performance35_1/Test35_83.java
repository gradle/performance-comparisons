package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_83 {
    private final Production35_83 production = new Production35_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}