package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_245 {
    private final Production59_245 production = new Production59_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}