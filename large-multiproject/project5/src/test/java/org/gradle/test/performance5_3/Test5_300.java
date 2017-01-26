package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_300 {
    private final Production5_300 production = new Production5_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}