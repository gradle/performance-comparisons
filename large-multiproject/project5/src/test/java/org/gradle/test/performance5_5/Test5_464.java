package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_464 {
    private final Production5_464 production = new Production5_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}