package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_337 {
    private final Production5_337 production = new Production5_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}