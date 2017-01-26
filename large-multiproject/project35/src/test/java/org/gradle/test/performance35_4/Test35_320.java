package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_320 {
    private final Production35_320 production = new Production35_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}