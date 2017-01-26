package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_345 {
    private final Production5_345 production = new Production5_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}