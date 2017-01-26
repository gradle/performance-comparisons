package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_77 {
    private final Production41_77 production = new Production41_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}