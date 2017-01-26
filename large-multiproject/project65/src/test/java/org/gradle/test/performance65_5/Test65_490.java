package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_490 {
    private final Production65_490 production = new Production65_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}