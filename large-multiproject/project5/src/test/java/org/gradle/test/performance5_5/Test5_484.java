package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_484 {
    private final Production5_484 production = new Production5_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}