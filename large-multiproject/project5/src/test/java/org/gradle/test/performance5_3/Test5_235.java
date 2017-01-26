package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_235 {
    private final Production5_235 production = new Production5_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}