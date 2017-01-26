package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_466 {
    private final Production35_466 production = new Production35_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}