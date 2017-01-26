package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_86 {
    private final Production59_86 production = new Production59_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}