package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_290 {
    private final Production35_290 production = new Production35_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}