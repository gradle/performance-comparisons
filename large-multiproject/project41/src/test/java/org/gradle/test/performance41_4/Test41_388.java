package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_388 {
    private final Production41_388 production = new Production41_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}