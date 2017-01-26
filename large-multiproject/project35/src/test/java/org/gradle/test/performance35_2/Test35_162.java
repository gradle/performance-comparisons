package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_162 {
    private final Production35_162 production = new Production35_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}