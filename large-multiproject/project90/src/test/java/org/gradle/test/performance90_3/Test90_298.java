package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_298 {
    private final Production90_298 production = new Production90_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}