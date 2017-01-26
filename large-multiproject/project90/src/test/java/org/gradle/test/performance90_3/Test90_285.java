package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_285 {
    private final Production90_285 production = new Production90_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}