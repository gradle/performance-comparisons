package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_434 {
    private final Production35_434 production = new Production35_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}