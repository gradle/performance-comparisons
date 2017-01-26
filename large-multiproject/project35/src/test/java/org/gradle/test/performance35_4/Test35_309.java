package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_309 {
    private final Production35_309 production = new Production35_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}