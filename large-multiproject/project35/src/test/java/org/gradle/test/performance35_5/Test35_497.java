package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_497 {
    private final Production35_497 production = new Production35_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}