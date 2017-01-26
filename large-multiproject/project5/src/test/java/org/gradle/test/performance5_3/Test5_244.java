package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_244 {
    private final Production5_244 production = new Production5_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}