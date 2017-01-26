package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_343 {
    private final Production5_343 production = new Production5_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}