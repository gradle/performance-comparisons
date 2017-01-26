package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_326 {
    private final Production43_326 production = new Production43_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}