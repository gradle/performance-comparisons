package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_346 {
    private final Production65_346 production = new Production65_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}