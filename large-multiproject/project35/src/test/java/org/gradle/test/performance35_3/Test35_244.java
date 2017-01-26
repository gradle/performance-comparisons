package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_244 {
    private final Production35_244 production = new Production35_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}