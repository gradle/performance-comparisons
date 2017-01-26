package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_391 {
    private final Production15_391 production = new Production15_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}