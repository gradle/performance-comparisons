package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_216 {
    private final Production35_216 production = new Production35_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}