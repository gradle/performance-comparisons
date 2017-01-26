package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_448 {
    private final Production97_448 production = new Production97_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}