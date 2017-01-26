package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_45 {
    private final Production41_45 production = new Production41_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}