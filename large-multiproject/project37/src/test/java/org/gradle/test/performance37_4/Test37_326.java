package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_326 {
    private final Production37_326 production = new Production37_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}