package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_169 {
    private final Production5_169 production = new Production5_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}