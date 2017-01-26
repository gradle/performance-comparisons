package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_418 {
    private final Production35_418 production = new Production35_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}