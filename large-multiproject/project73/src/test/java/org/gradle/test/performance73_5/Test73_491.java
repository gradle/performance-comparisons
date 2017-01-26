package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_491 {
    private final Production73_491 production = new Production73_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}