package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_170 {
    private final Production59_170 production = new Production59_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}