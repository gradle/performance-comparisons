package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_220 {
    private final Production35_220 production = new Production35_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}