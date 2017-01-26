package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_431 {
    private final Production35_431 production = new Production35_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}