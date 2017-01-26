package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_326 {
    private final Production35_326 production = new Production35_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}