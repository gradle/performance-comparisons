package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_285 {
    private final Production59_285 production = new Production59_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}