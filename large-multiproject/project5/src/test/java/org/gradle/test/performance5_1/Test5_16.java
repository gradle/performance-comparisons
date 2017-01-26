package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_16 {
    private final Production5_16 production = new Production5_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}