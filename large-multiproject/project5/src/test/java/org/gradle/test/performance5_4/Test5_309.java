package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_309 {
    private final Production5_309 production = new Production5_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}