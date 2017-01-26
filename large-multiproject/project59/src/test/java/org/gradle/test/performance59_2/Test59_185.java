package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_185 {
    private final Production59_185 production = new Production59_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}