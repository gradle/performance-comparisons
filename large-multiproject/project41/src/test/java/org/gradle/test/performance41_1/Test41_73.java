package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_73 {
    private final Production41_73 production = new Production41_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}