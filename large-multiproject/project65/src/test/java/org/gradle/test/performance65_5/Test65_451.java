package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_451 {
    private final Production65_451 production = new Production65_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}