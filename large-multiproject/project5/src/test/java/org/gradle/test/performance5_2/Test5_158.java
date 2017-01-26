package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_158 {
    private final Production5_158 production = new Production5_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}