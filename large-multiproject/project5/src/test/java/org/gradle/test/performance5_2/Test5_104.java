package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_104 {
    private final Production5_104 production = new Production5_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}