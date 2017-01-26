package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_173 {
    private final Production5_173 production = new Production5_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}