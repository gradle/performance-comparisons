package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_453 {
    private final Production59_453 production = new Production59_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}