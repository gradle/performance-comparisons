package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_78 {
    private final Production41_78 production = new Production41_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}