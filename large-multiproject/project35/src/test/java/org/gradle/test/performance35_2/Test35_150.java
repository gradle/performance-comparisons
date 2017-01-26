package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_150 {
    private final Production35_150 production = new Production35_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}