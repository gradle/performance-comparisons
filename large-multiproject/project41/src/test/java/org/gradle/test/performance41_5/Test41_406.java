package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_406 {
    private final Production41_406 production = new Production41_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}