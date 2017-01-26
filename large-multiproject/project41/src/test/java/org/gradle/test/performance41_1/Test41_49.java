package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_49 {
    private final Production41_49 production = new Production41_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}