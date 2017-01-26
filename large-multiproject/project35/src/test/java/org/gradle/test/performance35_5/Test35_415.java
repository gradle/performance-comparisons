package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_415 {
    private final Production35_415 production = new Production35_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}