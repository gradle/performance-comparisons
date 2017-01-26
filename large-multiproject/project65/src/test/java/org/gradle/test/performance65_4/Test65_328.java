package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_328 {
    private final Production65_328 production = new Production65_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}