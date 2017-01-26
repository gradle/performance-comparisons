package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_127 {
    private final Production5_127 production = new Production5_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}