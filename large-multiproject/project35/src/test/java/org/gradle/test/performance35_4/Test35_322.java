package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_322 {
    private final Production35_322 production = new Production35_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}