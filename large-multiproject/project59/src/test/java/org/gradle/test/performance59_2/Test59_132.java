package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_132 {
    private final Production59_132 production = new Production59_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}