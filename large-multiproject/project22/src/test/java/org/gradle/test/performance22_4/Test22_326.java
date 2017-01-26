package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_326 {
    private final Production22_326 production = new Production22_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}