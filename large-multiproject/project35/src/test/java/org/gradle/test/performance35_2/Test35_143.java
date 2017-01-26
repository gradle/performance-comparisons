package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_143 {
    private final Production35_143 production = new Production35_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}