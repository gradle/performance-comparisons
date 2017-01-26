package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_156 {
    private final Production5_156 production = new Production5_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}