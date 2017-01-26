package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_48 {
    private final Production35_48 production = new Production35_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}