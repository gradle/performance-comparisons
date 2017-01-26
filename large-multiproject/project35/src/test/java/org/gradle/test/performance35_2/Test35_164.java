package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_164 {
    private final Production35_164 production = new Production35_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}