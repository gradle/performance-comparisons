package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_410 {
    private final Production65_410 production = new Production65_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}