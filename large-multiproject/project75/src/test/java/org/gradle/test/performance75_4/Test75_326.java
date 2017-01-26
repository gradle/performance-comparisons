package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_326 {
    private final Production75_326 production = new Production75_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}