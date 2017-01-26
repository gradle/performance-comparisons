package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_101 {
    private final Production73_101 production = new Production73_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}