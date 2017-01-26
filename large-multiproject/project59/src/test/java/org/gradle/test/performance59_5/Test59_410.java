package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_410 {
    private final Production59_410 production = new Production59_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}