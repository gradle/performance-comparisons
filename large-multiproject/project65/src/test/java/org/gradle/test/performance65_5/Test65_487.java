package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_487 {
    private final Production65_487 production = new Production65_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}