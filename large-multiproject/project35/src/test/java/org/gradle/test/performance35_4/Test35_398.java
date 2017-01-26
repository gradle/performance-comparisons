package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_398 {
    private final Production35_398 production = new Production35_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}