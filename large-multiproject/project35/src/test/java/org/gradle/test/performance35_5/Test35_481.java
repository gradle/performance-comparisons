package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_481 {
    private final Production35_481 production = new Production35_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}