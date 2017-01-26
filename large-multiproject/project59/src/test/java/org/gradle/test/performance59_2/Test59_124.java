package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_124 {
    private final Production59_124 production = new Production59_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}