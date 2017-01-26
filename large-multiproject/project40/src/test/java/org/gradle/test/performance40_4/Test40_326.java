package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_326 {
    private final Production40_326 production = new Production40_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}