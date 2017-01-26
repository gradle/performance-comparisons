package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_161 {
    private final Production35_161 production = new Production35_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}