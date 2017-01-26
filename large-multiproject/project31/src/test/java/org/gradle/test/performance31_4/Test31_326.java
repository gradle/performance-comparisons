package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_326 {
    private final Production31_326 production = new Production31_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}