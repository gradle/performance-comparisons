package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_247 {
    private final Production35_247 production = new Production35_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}