package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_235 {
    private final Production35_235 production = new Production35_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}