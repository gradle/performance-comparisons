package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_50 {
    private final Production65_50 production = new Production65_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}