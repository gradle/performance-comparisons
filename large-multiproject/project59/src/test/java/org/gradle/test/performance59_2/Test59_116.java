package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_116 {
    private final Production59_116 production = new Production59_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}