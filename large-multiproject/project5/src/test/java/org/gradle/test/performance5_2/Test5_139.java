package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_139 {
    private final Production5_139 production = new Production5_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}