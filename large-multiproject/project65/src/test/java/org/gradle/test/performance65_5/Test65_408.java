package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_408 {
    private final Production65_408 production = new Production65_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}