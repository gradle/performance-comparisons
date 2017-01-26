package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_204 {
    private final Production35_204 production = new Production35_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}