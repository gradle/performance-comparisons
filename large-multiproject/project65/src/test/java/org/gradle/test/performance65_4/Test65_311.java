package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_311 {
    private final Production65_311 production = new Production65_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}