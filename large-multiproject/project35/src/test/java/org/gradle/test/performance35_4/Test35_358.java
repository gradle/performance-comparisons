package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_358 {
    private final Production35_358 production = new Production35_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}