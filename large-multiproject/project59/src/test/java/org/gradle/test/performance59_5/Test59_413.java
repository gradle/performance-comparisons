package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_413 {
    private final Production59_413 production = new Production59_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}