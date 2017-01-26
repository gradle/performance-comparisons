package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_326 {
    private final Production84_326 production = new Production84_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}