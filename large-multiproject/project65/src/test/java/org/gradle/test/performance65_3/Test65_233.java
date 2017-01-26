package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_233 {
    private final Production65_233 production = new Production65_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}