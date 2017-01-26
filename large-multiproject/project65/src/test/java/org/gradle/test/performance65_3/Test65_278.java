package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_278 {
    private final Production65_278 production = new Production65_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}