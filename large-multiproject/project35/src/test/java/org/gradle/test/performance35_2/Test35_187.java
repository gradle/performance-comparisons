package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_187 {
    private final Production35_187 production = new Production35_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}