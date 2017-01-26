package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_421 {
    private final Production5_421 production = new Production5_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}