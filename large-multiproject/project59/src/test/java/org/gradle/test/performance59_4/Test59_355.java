package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_355 {
    private final Production59_355 production = new Production59_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}