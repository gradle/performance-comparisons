package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_488 {
    private final Production5_488 production = new Production5_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}