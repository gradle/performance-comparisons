package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_285 {
    private final Production99_285 production = new Production99_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}