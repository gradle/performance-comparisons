package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_292 {
    private final Production59_292 production = new Production59_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}