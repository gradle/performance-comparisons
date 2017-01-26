package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_316 {
    private final Production59_316 production = new Production59_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}