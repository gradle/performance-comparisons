package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_190 {
    private final Production59_190 production = new Production59_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}