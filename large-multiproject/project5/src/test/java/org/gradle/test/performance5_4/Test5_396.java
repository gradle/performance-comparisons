package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_396 {
    private final Production5_396 production = new Production5_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}