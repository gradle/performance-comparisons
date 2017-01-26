package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_326 {
    private final Production7_326 production = new Production7_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}