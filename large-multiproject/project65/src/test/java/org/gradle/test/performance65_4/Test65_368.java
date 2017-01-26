package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_368 {
    private final Production65_368 production = new Production65_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}