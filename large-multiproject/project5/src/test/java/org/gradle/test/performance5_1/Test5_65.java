package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_65 {
    private final Production5_65 production = new Production5_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}