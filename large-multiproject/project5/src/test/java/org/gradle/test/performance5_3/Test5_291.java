package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_291 {
    private final Production5_291 production = new Production5_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}