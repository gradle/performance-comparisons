package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_474 {
    private final Production35_474 production = new Production35_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}