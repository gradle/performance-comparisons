package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_430 {
    private final Production45_430 production = new Production45_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}