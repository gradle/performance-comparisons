package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_33 {
    private final Production35_33 production = new Production35_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}