package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_173 {
    private final Production35_173 production = new Production35_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}