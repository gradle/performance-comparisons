package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_130 {
    private final Production59_130 production = new Production59_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}