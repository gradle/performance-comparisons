package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_54 {
    private final Production5_54 production = new Production5_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}