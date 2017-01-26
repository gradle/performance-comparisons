package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_162 {
    private final Production5_162 production = new Production5_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}