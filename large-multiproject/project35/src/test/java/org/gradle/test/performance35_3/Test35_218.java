package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_218 {
    private final Production35_218 production = new Production35_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}