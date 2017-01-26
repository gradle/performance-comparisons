package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_289 {
    private final Production35_289 production = new Production35_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}