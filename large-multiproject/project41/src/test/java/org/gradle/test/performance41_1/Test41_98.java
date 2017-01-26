package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_98 {
    private final Production41_98 production = new Production41_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}