package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_389 {
    private final Production65_389 production = new Production65_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}