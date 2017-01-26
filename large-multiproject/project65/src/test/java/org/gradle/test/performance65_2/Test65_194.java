package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_194 {
    private final Production65_194 production = new Production65_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}