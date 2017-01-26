package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_101 {
    private final Production59_101 production = new Production59_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}