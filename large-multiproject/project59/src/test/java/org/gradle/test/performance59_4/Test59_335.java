package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_335 {
    private final Production59_335 production = new Production59_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}