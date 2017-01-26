package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_326 {
    private final Production93_326 production = new Production93_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}