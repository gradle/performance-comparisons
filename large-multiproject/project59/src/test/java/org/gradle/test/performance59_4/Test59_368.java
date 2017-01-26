package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_368 {
    private final Production59_368 production = new Production59_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}