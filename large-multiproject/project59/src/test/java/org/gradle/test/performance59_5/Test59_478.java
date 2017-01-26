package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_478 {
    private final Production59_478 production = new Production59_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}