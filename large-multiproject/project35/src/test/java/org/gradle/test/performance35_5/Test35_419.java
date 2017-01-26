package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_419 {
    private final Production35_419 production = new Production35_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}