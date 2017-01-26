package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_450 {
    private final Production35_450 production = new Production35_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}