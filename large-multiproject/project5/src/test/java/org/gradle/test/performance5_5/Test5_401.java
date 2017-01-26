package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_401 {
    private final Production5_401 production = new Production5_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}