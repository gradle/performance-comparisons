package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_31 {
    private final Production5_31 production = new Production5_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}