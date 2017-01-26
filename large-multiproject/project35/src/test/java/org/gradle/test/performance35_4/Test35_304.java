package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_304 {
    private final Production35_304 production = new Production35_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}