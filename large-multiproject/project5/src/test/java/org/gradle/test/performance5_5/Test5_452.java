package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_452 {
    private final Production5_452 production = new Production5_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}