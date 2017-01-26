package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_298 {
    private final Production65_298 production = new Production65_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}