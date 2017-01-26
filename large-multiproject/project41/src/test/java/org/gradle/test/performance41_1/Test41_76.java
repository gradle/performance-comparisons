package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_76 {
    private final Production41_76 production = new Production41_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}