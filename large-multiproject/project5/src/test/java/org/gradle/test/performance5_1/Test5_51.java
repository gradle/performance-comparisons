package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_51 {
    private final Production5_51 production = new Production5_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}