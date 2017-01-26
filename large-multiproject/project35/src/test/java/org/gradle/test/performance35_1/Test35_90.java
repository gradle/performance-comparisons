package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_90 {
    private final Production35_90 production = new Production35_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}