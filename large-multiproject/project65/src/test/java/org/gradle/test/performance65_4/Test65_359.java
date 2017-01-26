package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_359 {
    private final Production65_359 production = new Production65_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}