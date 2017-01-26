package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_37 {
    private final Production35_37 production = new Production35_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}