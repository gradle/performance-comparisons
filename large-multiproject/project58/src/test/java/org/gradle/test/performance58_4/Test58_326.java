package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_326 {
    private final Production58_326 production = new Production58_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}