package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_493 {
    private final Production65_493 production = new Production65_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}