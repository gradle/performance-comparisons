package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_326 {
    private final Production4_326 production = new Production4_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}