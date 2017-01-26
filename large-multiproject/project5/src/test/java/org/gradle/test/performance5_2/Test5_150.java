package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_150 {
    private final Production5_150 production = new Production5_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}