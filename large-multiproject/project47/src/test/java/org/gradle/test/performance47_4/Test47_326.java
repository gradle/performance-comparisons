package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_326 {
    private final Production47_326 production = new Production47_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}