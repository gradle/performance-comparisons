package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_448 {
    private final Production65_448 production = new Production65_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}