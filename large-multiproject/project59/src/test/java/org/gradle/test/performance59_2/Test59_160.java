package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_160 {
    private final Production59_160 production = new Production59_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}