package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_267 {
    private final Production41_267 production = new Production41_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}