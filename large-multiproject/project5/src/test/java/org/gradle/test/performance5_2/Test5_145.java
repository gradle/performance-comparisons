package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_145 {
    private final Production5_145 production = new Production5_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}