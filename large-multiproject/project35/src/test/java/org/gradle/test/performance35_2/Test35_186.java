package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_186 {
    private final Production35_186 production = new Production35_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}