package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_63 {
    private final Production5_63 production = new Production5_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}