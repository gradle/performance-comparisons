package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_346 {
    private final Production59_346 production = new Production59_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}