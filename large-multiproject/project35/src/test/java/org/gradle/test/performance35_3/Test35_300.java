package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_300 {
    private final Production35_300 production = new Production35_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}