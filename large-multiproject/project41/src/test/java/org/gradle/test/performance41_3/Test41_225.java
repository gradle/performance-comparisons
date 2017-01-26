package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_225 {
    private final Production41_225 production = new Production41_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}