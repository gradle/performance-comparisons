package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_39 {
    private final Production35_39 production = new Production35_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}