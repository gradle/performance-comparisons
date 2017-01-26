package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_482 {
    private final Production35_482 production = new Production35_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}