package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_203 {
    private final Production35_203 production = new Production35_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}