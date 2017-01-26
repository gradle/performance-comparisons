package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_22 {
    private final Production59_22 production = new Production59_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}