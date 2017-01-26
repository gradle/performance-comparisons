package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_60 {
    private final Production35_60 production = new Production35_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}