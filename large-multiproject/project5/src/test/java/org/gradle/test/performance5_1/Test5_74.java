package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_74 {
    private final Production5_74 production = new Production5_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}