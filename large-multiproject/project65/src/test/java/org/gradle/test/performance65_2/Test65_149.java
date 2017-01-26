package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_149 {
    private final Production65_149 production = new Production65_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}