package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_395 {
    private final Production35_395 production = new Production35_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}