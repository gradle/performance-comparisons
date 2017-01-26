package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_139 {
    private final Production35_139 production = new Production35_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}