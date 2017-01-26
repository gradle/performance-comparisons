package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_327 {
    private final Production59_327 production = new Production59_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}