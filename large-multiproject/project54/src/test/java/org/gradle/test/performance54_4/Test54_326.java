package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_326 {
    private final Production54_326 production = new Production54_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}