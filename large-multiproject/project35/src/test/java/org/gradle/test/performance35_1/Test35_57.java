package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_57 {
    private final Production35_57 production = new Production35_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}