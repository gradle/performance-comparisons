package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_403 {
    private final Production5_403 production = new Production5_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}