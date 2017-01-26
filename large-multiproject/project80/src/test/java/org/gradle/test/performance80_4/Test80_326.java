package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_326 {
    private final Production80_326 production = new Production80_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}