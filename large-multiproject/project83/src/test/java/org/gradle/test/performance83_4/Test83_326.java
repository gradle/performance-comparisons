package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_326 {
    private final Production83_326 production = new Production83_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}