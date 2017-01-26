package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_141 {
    private final Production65_141 production = new Production65_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}