package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_285 {
    private final Production65_285 production = new Production65_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}