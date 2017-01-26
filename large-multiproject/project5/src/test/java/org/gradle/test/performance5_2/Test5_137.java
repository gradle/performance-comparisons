package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_137 {
    private final Production5_137 production = new Production5_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}