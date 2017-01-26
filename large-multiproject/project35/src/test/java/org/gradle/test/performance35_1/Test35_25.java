package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_25 {
    private final Production35_25 production = new Production35_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}