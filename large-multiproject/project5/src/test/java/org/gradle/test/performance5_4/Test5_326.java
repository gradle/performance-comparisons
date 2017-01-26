package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_326 {
    private final Production5_326 production = new Production5_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}