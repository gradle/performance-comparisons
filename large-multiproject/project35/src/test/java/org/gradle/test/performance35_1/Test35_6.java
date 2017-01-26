package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_6 {
    private final Production35_6 production = new Production35_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}