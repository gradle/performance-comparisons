package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_152 {
    private final Production5_152 production = new Production5_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}