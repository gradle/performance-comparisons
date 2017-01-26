package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_337 {
    private final Production35_337 production = new Production35_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}