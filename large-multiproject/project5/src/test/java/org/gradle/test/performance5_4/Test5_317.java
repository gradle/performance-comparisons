package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_317 {
    private final Production5_317 production = new Production5_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}