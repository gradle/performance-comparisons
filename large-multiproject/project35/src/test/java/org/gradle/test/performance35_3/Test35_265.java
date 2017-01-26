package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_265 {
    private final Production35_265 production = new Production35_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}