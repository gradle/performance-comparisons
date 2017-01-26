package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_391 {
    private final Production73_391 production = new Production73_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}