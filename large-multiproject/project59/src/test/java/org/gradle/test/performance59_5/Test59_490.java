package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_490 {
    private final Production59_490 production = new Production59_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}