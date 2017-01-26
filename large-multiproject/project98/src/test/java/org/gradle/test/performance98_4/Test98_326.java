package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_326 {
    private final Production98_326 production = new Production98_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}