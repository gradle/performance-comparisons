package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_391 {
    private final Production59_391 production = new Production59_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}