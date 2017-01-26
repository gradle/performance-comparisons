package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_175 {
    private final Production35_175 production = new Production35_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}