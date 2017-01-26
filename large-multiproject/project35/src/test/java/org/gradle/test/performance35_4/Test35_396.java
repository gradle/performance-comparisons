package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_396 {
    private final Production35_396 production = new Production35_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}