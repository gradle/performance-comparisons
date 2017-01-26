package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_299 {
    private final Production65_299 production = new Production65_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}