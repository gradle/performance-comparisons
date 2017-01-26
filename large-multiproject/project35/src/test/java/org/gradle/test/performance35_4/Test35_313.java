package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_313 {
    private final Production35_313 production = new Production35_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}