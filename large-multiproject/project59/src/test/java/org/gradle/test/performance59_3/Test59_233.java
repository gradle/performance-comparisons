package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_233 {
    private final Production59_233 production = new Production59_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}