package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_477 {
    private final Production35_477 production = new Production35_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}