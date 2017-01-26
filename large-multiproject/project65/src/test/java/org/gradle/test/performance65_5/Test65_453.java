package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_453 {
    private final Production65_453 production = new Production65_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}