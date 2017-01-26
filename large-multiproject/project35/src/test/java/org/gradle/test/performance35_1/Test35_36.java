package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_36 {
    private final Production35_36 production = new Production35_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}