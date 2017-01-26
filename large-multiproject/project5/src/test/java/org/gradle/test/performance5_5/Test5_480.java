package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_480 {
    private final Production5_480 production = new Production5_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}