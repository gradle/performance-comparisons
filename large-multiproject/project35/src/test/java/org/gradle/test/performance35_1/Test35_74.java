package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_74 {
    private final Production35_74 production = new Production35_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}