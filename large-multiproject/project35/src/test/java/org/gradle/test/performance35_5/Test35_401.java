package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_401 {
    private final Production35_401 production = new Production35_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}