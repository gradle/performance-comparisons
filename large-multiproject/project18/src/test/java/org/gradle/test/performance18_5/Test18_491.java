package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_491 {
    private final Production18_491 production = new Production18_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}