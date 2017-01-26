package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_395 {
    private final Production5_395 production = new Production5_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}