package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_238 {
    private final Production5_238 production = new Production5_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}