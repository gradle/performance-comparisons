package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_81 {
    private final Production35_81 production = new Production35_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}