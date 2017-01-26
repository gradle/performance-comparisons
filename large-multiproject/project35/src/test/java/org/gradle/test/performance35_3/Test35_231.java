package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_231 {
    private final Production35_231 production = new Production35_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}