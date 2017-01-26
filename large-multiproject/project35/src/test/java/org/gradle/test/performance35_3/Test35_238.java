package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_238 {
    private final Production35_238 production = new Production35_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}