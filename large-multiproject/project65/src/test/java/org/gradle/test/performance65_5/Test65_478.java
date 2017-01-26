package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_478 {
    private final Production65_478 production = new Production65_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}