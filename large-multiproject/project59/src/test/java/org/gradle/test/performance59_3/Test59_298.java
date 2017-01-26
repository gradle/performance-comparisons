package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_298 {
    private final Production59_298 production = new Production59_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}