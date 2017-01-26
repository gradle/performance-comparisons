package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_262 {
    private final Production65_262 production = new Production65_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}