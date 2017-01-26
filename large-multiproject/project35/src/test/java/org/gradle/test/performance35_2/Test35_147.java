package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_147 {
    private final Production35_147 production = new Production35_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}