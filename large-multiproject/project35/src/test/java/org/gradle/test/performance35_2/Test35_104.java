package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_104 {
    private final Production35_104 production = new Production35_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}