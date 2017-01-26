package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_220 {
    private final Production5_220 production = new Production5_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}