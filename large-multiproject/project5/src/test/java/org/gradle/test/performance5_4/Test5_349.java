package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_349 {
    private final Production5_349 production = new Production5_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}