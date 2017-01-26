package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_174 {
    private final Production5_174 production = new Production5_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}